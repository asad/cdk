/* Copyright (C) 2009,2012  Egon Willighagen <egonw@users.sf.net>
 *
 * Contact: cdk-devel@lists.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.openscience.cdk.modulesuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openscience.cdk.coverage.RenderextraCoverageTest;
import org.openscience.cdk.renderer.ChemModelRendererTest;
import org.openscience.cdk.renderer.MoleculeSetRendererTest;
import org.openscience.cdk.renderer.ReactionRendererTest;
import org.openscience.cdk.renderer.ReactionSetRendererTest;

/**
 * TestSuite that runs all the tests for the CDK <code>renderextra</code>
 * module.
 *
 * @cdk.module  test-renderextra
 */
@RunWith(Suite.class)
@SuiteClasses({
	RenderextraCoverageTest.class,
	MoleculeSetRendererTest.class,
	ChemModelRendererTest.class,
	ReactionRendererTest.class,
	ReactionSetRendererTest.class
})
public class MrenderextraTests {}
