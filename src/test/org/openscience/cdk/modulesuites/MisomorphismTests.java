/* Copyright (C) 1997-2007  The Chemistry Development Kit (CDK) project
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
import org.openscience.cdk.coverage.IsomorphismCoverageTest;
import org.openscience.cdk.isomorphism.matchers.QueryAtomContainerCreatorTest;
import org.openscience.cdk.isomorphism.matchers.RGroupListTest;
import org.openscience.cdk.isomorphism.matchers.SymbolSetQueryAtomTest;
import org.openscience.cdk.isomorphism.matchers.smarts.AnyOrderQueryBondTest;

/**
 * TestSuite that runs all the tests for the CDK core module.
 *
 * @cdk.module  test-isomorphism
 */
@RunWith(value=Suite.class)
@SuiteClasses(value={
    IsomorphismCoverageTest.class,
    RGroupListTest.class,
    SymbolSetQueryAtomTest.class,
    QueryAtomContainerCreatorTest.class,
    AnyOrderQueryBondTest.class
})
public class MisomorphismTests {}
