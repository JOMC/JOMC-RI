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

import org.jomc.ri.DefaultListener;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * {@code DefaultListener} test cases.
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.0
 * @version $Id$
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools-1.1-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public class DefaultListenerTest extends ListenerTest
{
    // SECTION-START[DefaultListenerTest]

    private DefaultListener defaultListener;

    @Override
    public DefaultListener getListener()
    {
        if ( this.defaultListener == null )
        {
            this.defaultListener = new DefaultListener();
        }

        return this.defaultListener;
    }

    public void testDefaultEnabled() throws Exception
    {
        assertTrue( DefaultListener.isDefaultEnabled() );
        System.setProperty( "org.jomc.ri.DefaultListener.defaultEnabled", Boolean.toString( false ) );
        DefaultListener.setDefaultEnabled( null );
        assertFalse( DefaultListener.isDefaultEnabled() );
        System.clearProperty( "org.jomc.ri.DefaultListener.defaultEnabled" );
        DefaultListener.setDefaultEnabled( null );
    }

    public void testEnabled() throws Exception
    {
        DefaultListener.setDefaultEnabled( null );
        this.getListener().setEnabled( null );
        assertTrue( this.getListener().isEnabled() );

        DefaultListener.setDefaultEnabled( false );
        this.getListener().setEnabled( null );
        assertFalse( this.getListener().isEnabled() );

        DefaultListener.setDefaultEnabled( null );
        this.getListener().setEnabled( null );
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">

    /** Creates a new {@code DefaultListenerTest} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.1-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.1/jomc-tools-1.1-SNAPSHOT" )
    public DefaultListenerTest()
    {
        // SECTION-START[Default Constructor]
        super();
        // SECTION-END
    }
    // </editor-fold>
    // SECTION-END
    // SECTION-START[Dependencies]
    // SECTION-END
    // SECTION-START[Properties]
    // SECTION-END
    // SECTION-START[Messages]
    // SECTION-END
}