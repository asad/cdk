/* Copyright (C) 2012  Egon Willighagen <egonw@users.sf.net>
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
package org.openscience.cdk.stereo;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openscience.cdk.Atom;
import org.openscience.cdk.AtomContainer;
import org.openscience.cdk.CDKTestCase;
import org.openscience.cdk.DefaultChemObjectBuilder;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IBond;
import org.openscience.cdk.interfaces.IBond.Order;
import org.openscience.cdk.interfaces.IDoubleBondStereochemistry.Conformation;

/**
 * @cdk.module test-core
 */
public class DoubleBondStereochemistryTest extends CDKTestCase {

    private static IAtomContainer molecule;
    private static IBond[] ligands;

    /**
     * This method creates <i>E</i>-but-2-ene.
     */
    @BeforeClass
    public static void setup() throws Exception {
        molecule = new AtomContainer();
        molecule.addAtom(new Atom("C"));
        molecule.addAtom(new Atom("C"));
        molecule.addAtom(new Atom("C"));
        molecule.addAtom(new Atom("C"));
        molecule.addBond(0, 1, Order.SINGLE);
        molecule.addBond(1, 2, Order.DOUBLE);
        molecule.addBond(2, 3, Order.SINGLE);
        ligands = new IBond[] {
            molecule.getBond(0),
            molecule.getBond(2)
        };
    }

    @Test
    public void testConstructor() {
        DoubleBondStereochemistry stereo = new DoubleBondStereochemistry(
            molecule.getBond(1), ligands, Conformation.OPPOSITE
        );
        Assert.assertNotNull(stereo);
    }

    @Test
    public void testBuilder() {
        DoubleBondStereochemistry stereo = new DoubleBondStereochemistry(
            molecule.getBond(1), ligands, Conformation.OPPOSITE
        );
        Assert.assertNull(stereo.getBuilder());
        stereo.setBuilder(DefaultChemObjectBuilder.getInstance());
        Assert.assertEquals(
            DefaultChemObjectBuilder.getInstance(),
            stereo.getBuilder()
        );
    }

    @Test
    public void testGetStereoBond() {
        DoubleBondStereochemistry stereo = new DoubleBondStereochemistry(
            molecule.getBond(1), ligands, Conformation.OPPOSITE
        );
        Assert.assertNotNull(stereo);
        Assert.assertEquals(molecule.getBond(1), stereo.getStereoBond());
    }

    @Test
    public void testGetStereo() {
        DoubleBondStereochemistry stereo = new DoubleBondStereochemistry(
            molecule.getBond(1), ligands, Conformation.OPPOSITE
        );
        Assert.assertNotNull(stereo);
        Assert.assertEquals(Conformation.OPPOSITE, stereo.getStereo());
    }

    @Test
    public void testGetBonds() {
        DoubleBondStereochemistry stereo = new DoubleBondStereochemistry(
                molecule.getBond(1), ligands, Conformation.OPPOSITE
            );
        Assert.assertNotNull(stereo);
        for (int i=0; i<ligands.length; i++) {
            Assert.assertEquals(ligands[i], stereo.getBonds()[i]);
        }
    }

    @Test
    public void testToString() {
        DoubleBondStereochemistry stereo = new DoubleBondStereochemistry(
                molecule.getBond(1), ligands, Conformation.OPPOSITE
            );
        String stringRepr = stereo.toString();
        Assert.assertNotSame(0, stringRepr.length());
        Assert.assertFalse(stringRepr.contains("\n"));
    }
}


