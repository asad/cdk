/* Copyright (C) 2013  John May <jwmay@users.sf.net>
 *
 * Contact: cdk-devel@lists.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
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
package org.openscience.cdk.modulesuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openscience.cdk.coverage.HashCoverageTest;
import org.openscience.cdk.hash.AbstractHashGeneratorTest;
import org.openscience.cdk.hash.BasicAtomHashGeneratorTest;
import org.openscience.cdk.hash.BasicMoleculeHashGeneratorTest;
import org.openscience.cdk.hash.HashCodeScenarios;
import org.openscience.cdk.hash.HashGeneratorMakerTest;
import org.openscience.cdk.hash.PerturbedAtomHashGeneratorTest;
import org.openscience.cdk.hash.XorshiftTest;
import org.openscience.cdk.hash.equivalent.MinimumEquivalentCyclicSet;
import org.openscience.cdk.hash.equivalent.MinimumEquivalentCyclicSetTest;
import org.openscience.cdk.hash.seed.BasicAtomEncoderTest;
import org.openscience.cdk.hash.seed.ConjugatedAtomEncoderTest;
import org.openscience.cdk.hash.stereo.BasicPermutationParityTest;
import org.openscience.cdk.hash.stereo.GeometryEncoderTest;
import org.openscience.cdk.hash.stereo.MultiStereoEncoderTest;
import org.openscience.cdk.hash.stereo.factory.GeometricDoubleBondEncoderFactoryTest;
import org.openscience.cdk.hash.stereo.factory.GeometricTetrahedralEncoderFactoryTest;
import org.openscience.cdk.hash.stereo.parity.CombinedPermutationParityTest;
import org.openscience.cdk.hash.stereo.parity.DoubleBond2DParityTest;
import org.openscience.cdk.hash.stereo.parity.DoubleBond3DParityTest;
import org.openscience.cdk.hash.stereo.parity.Tetrahedral2DParityTest;
import org.openscience.cdk.hash.stereo.parity.Tetrahedral3DParityTest;

/**
 * TestSuite for the CDK <code>hash</code> module.
 *
 * @cdk.module test-hash
 */
@RunWith(value = Suite.class)
@SuiteClasses(value = {
        HashCoverageTest.class,
        XorshiftTest.class,
        BasicAtomEncoderTest.class,
        ConjugatedAtomEncoderTest.class,
        AbstractHashGeneratorTest.class,
        BasicAtomHashGeneratorTest.class,
        BasicMoleculeHashGeneratorTest.class,
        HashGeneratorMakerTest.class,
        BasicPermutationParityTest.class,
        CombinedPermutationParityTest.class,
        Tetrahedral2DParityTest.class,
        Tetrahedral3DParityTest.class,
        DoubleBond2DParityTest.class,
        DoubleBond3DParityTest.class,
        GeometryEncoderTest.class,
        MultiStereoEncoderTest.class,
        GeometricTetrahedralEncoderFactoryTest.class,
        GeometricDoubleBondEncoderFactoryTest.class,
        PerturbedAtomHashGeneratorTest.class,
        MinimumEquivalentCyclicSetTest.class,
        HashCodeScenarios.class
})
public class MhashTests {
}
