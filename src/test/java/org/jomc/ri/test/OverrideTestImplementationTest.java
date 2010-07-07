// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (c) 2010 The JOMC Project
 *   Copyright (c) 2005 Christian Schulte <schulte2005@users.sourceforge.net>
 *   All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without
 *   modification, are permitted provided that the following conditions
 *   are met:
 *
 *     o Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *
 *     o Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in
 *       the documentation and/or other materials provided with the
 *       distribution.
 *
 *   THIS SOFTWARE IS PROVIDED BY THE JOMC PROJECT AND CONTRIBUTORS "AS IS"
 *   AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 *   THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *   PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE JOMC PROJECT OR
 *   CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 *   EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 *   PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 *   OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 *   WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 *   OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *   ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   $Id$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.ri.test;

import static junit.framework.Assert.assertEquals;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Override test cases.
 * <p><b>Dependencies</b><ul>
 * <li>"{@link #getOverrideTestSpecification Override Test Specification}"<blockquote>
 * Dependency on {@code 'Override Test Specification'} {@code (org.jomc.ri.test.OverrideTestSpecification)} bound to an instance.</blockquote></li>
 * </ul></p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools" )
// </editor-fold>
// SECTION-END
public class OverrideTestImplementationTest
{
    // SECTION-START[OverrideTestImplementationTest]

    public void testProperty() throws Exception
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

    public void testMessage() throws Exception
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
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools" )
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
     * Gets the {@code Override Test Specification} dependency.
     * <p>This method returns the {@code 'Override Test Implementation'} object of the {@code 'Override Test Specification'} {@code (org.jomc.ri.test.OverrideTestSpecification)} specification.</p>
     * <p>That specification does not apply to any scope. A new object is returned whenever requested and bound to this instance.</p>
     * <p><b>Properties</b><dl>
     * <dt>"{@code propertyImpl}"</dt>
     * <dd>Property of type {@code java.lang.String}.
     * </dd>
     * </dl>
     * @return The {@code Override Test Specification} dependency.
     * @throws org.jomc.ObjectManagementException if getting the dependency instance fails.
     */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools" )
    private org.jomc.ri.test.OverrideTestSpecification getOverrideTestSpecification()
    {
        final org.jomc.ri.test.OverrideTestSpecification _d = (org.jomc.ri.test.OverrideTestSpecification) org.jomc.ObjectManagerFactory.getObjectManager( this.getClass().getClassLoader() ).getDependency( this, "Override Test Specification" );
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
