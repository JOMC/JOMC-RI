// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 * Java Object Management and Configuration
 * Copyright (C) Christian Schulte <cs@schulte.it>, 2005-206
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   o Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   o Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in
 *     the documentation and/or other materials provided with the
 *     distribution.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 * AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 * THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * $JOMC$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.ri.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Override test cases.
 *
 * <dl>
 *   <dt><b>Identifier:</b></dt><dd>JOMC ⁑ RI ⁑ Tests ⁑ Override Test Implementation Tests</dd>
 *   <dt><b>Name:</b></dt><dd>JOMC ⁑ RI ⁑ Tests ⁑ Override Test Implementation Tests</dd>
 *   <dt><b>Abstract:</b></dt><dd>No</dd>
 *   <dt><b>Final:</b></dt><dd>No</dd>
 *   <dt><b>Stateless:</b></dt><dd>No</dd>
 * </dl>
 *
 * @author <a href="mailto:cs@schulte.it">Christian Schulte</a> 1.0
 * @version 2.0.0-SNAPSHOT
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 2.0.0-SNAPSHOT", comments = "See http://www.jomc.org/jomc-tools/2.0.0-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public class OverrideTestImplementationTest
{
    // SECTION-START[OverrideTestImplementationTest]

    @Test
    public final void testProperty() throws Exception
    {
        System.out.println( this.getOverrideTestSpecification().getProperty() );
        assertEquals( "Overriden", this.getOverrideTestSpecification().getProperty() );
        System.out.println( this.getOverrideTestSpecification().getDependency().getProperty() );
        assertEquals( "Recursion 1", this.getOverrideTestSpecification().getDependency().getProperty() );
        System.out.println( this.getOverrideTestSpecification().getDependency().getDependency().getProperty() );
        assertEquals( "Recursion 2", this.getOverrideTestSpecification().getDependency().getDependency().
                      getProperty() );

        System.out.println( this.getOverrideTestSpecification().getDependency().getDependency().getDependency().
            getProperty() );

        assertEquals( "Recursion 3", this.getOverrideTestSpecification().getDependency().getDependency().
                      getDependency().getProperty() );

        System.out.println( this.getOverrideTestSpecification().getDependency().getDependency().getDependency().
            getDependency().getProperty() );

        assertEquals( "Recursion 4", this.getOverrideTestSpecification().getDependency().getDependency().
                      getDependency().getDependency().getProperty() );

    }

    @Test
    public final void testMessage() throws Exception
    {
        System.out.println( this.getOverrideTestSpecification().getMessage() );
        assertEquals( "Overriden", this.getOverrideTestSpecification().getMessage() );
        System.out.println( this.getOverrideTestSpecification().getDependency().getMessage() );
        assertEquals( "Recursion 1", this.getOverrideTestSpecification().getDependency().getMessage() );
        System.out.println( this.getOverrideTestSpecification().getDependency().getDependency().getMessage() );
        assertEquals( "Recursion 2", this.getOverrideTestSpecification().getDependency().getDependency().
                      getMessage() );

        System.out.println( this.getOverrideTestSpecification().getDependency().getDependency().getDependency().
            getMessage() );

        assertEquals( "Recursion 3", this.getOverrideTestSpecification().getDependency().getDependency().
                      getDependency().getMessage() );

        System.out.println( this.getOverrideTestSpecification().getDependency().getDependency().getDependency().
            getDependency().getMessage() );

        assertEquals( "Recursion 4", this.getOverrideTestSpecification().getDependency().getDependency().
                      getDependency().getDependency().getMessage() );

    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code OverrideTestImplementationTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 2.0.0-SNAPSHOT", comments = "See http://www.jomc.org/jomc-tools/2.0.0-SNAPSHOT" )
    public OverrideTestImplementationTest()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Dependencies]
    // <editor-fold defaultstate="collapsed" desc=" Generated Dependencies ">
    /**
     * Gets the {@code <Override Test Specification>} dependency.
     * <p>
     *   This method returns the {@code <JOMC ⁑ RI ⁑ Tests ⁑ Override Test Implementation>} object of the {@code <JOMC ⁑ RI ⁑ Tests ⁑ Override Test Specification>} specification at any specification level.
     *   That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.
     * </p>
     * <p><strong>Properties:</strong>
     *   <table border="1" width="100%" cellpadding="3" cellspacing="0">
     *     <tr class="TableSubHeadingColor">
     *       <th align="left" scope="col" nowrap><b>Name</b></th>
     *       <th align="left" scope="col" nowrap><b>Type</b></th>
     *       <th align="left" scope="col" nowrap><b>Documentation</b></th>
     *     </tr>
     *     <tr class="TableRow">
     *       <td align="left" valign="top" nowrap>{@code <Property Impl>}</td>
     *       <td align="left" valign="top" nowrap>{@code java.lang.String}</td>
     *       <td align="left" valign="top"></td>
     *     </tr>
     *   </table>
     * </p>
     * <dl>
     *   <dt><b>Final:</b></dt><dd>No</dd>
     * </dl>
     * @return The {@code <Override Test Specification>} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @SuppressWarnings({"unchecked", "unused", "PMD.UnnecessaryFullyQualifiedName"})
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 2.0.0-SNAPSHOT", comments = "See http://www.jomc.org/jomc-tools/2.0.0-SNAPSHOT" )
    private org.jomc.ri.test.support.OverrideTestSpecification getOverrideTestSpecification()
    {
        final org.jomc.ri.test.support.OverrideTestSpecification _d = (org.jomc.ri.test.support.OverrideTestSpecification) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Override Test Specification" );
        assert _d != null : "'Override Test Specification' dependency not found.";
        return _d;
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Properties]
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END

}
