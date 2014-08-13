/* Copyright (C) 1997-2007  Christoph Steinbeck <steinbeck@users.sf.net>
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
 */
package org.openscience.cdk.event;

import org.openscience.cdk.interfaces.IChemObjectChangeEvent;

/**
 * Event fired by cdk classes to their registered listeners
 * in case something changes within them.
 *
 * @cdk.module data
 * @cdk.githash
 */
public class ChemObjectChangeEvent extends java.util.EventObject implements IChemObjectChangeEvent
{

    private static final long serialVersionUID = 5418604788783986725L;

    /**
	 * Constructs a ChemObjectChangeEvent with a reference 
	 * to the object where it originated.
	 *
	 * @param   source The reference to the object where this change event originated
	 */
	public ChemObjectChangeEvent(Object source)
	{
		super(source);
	}
}
