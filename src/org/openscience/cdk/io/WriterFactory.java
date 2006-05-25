/* $RCSfile$
 * $Author: egonw $
 * $Date: 2006-05-09 21:32:32 +0200 (Tue, 09 May 2006) $  
 * $Revision: 6204 $
 *
 * Copyright (C) 1997-2006  The Chemistry Development Kit (CDK) project
 *
 * Contact: cdk-devel@lists.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * All we ask is that proper credit is given for our work, which includes
 * - but is not limited to - adding the above copyright notice to the beginning
 * of your source code files, and to any copyright notice that you may distribute
 * with programs based on this work.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */
package org.openscience.cdk.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openscience.cdk.io.formats.IChemFormat;
import org.openscience.cdk.io.formats.IResourceFormat;
import org.openscience.cdk.tools.LoggingTool;

/**
 * Helper tool to create IChemObjectWriters.
 * 
 * @author Egon Willighagen <ewilligh@uni-koeln.de>
 * @cdk.module io
 **/
public class WriterFactory {

    private final static String IO_FORMATS_LIST = "io-formats.set";

    private LoggingTool logger;

    private static List formats = null;

    /**
     * Constructs a ChemObjectIOInstantionTests.
     */
    public WriterFactory() {
    	logger = new LoggingTool(this);
    }

    /**
     * Finds IChemFormats that provide a container for serialization for the
     * given features. The syntax of the integer is explained in the DataFeatures class.
     * 
     * @param  features the data features for which a IChemFormat is searched
     * @return          an array of IChemFormat's that can contain the given features
     * 
     * @see    org.openscience.cdk.tools.DataFeatures
     */
    public IChemFormat[] findChemFormats(int features) {
    	if (formats == null) loadFormats();
    	
    	Iterator iter = formats.iterator();
    	List matches = new ArrayList();
    	while (iter.hasNext()) {
    		IChemFormat format = (IChemFormat)iter.next();
    		if ((format.getSupportedDataFeatures() & features) == features) matches.add(format);
    	}
    	
    	return (IChemFormat[])matches.toArray(new IChemFormat[0]);
    }
    
    private void loadFormats() {
        if (formats == null) {
            formats = new ArrayList();
            try {
                logger.debug("Starting loading Formats...");
                BufferedReader reader = new BufferedReader(new InputStreamReader(
                    this.getClass().getClassLoader().getResourceAsStream(IO_FORMATS_LIST)
                ));
                int formatCount = 0;
                while (reader.ready()) {
                    // load them one by one
                    String formatName = reader.readLine();
                    formatCount++;
                    try {
                        IResourceFormat format = (IResourceFormat)this.getClass().getClassLoader().
                            loadClass(formatName).newInstance();
                        if (format instanceof IChemFormat) {
                        	formats.add(format);
                        	logger.info("Loaded IChemFormat: " + format.getClass().getName());
                        }
                    } catch (ClassNotFoundException exception) {
                        logger.error("Could not find this IResourceFormat: ", formatName);
                        logger.debug(exception);
                    } catch (Exception exception) {
                        logger.error("Could not load this IResourceFormat: ", formatName);
                        logger.debug(exception);
                    }
                }
                logger.info("Number of loaded formats used in detection: ", formatCount);
            } catch (Exception exception) {
                logger.error("Could not load this io format list: ", IO_FORMATS_LIST);
                logger.debug(exception);
            }
        }
    }
    
}

