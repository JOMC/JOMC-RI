// SECTION-START[License Header]
// <editor-fold defaultstate="collapsed" desc=" Generated License ">
/*
 *   Copyright (C) Christian Schulte, 2011-313
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
 *   THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 *   INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY
 *   AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL
 *   THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *   INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *   NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *   DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *   THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *   (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *   THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   $JOMC$
 *
 */
// </editor-fold>
// SECTION-END
package org.jomc.ri.model;

import org.jomc.model.ImplementationReference;

// SECTION-START[Documentation]
// <editor-fold defaultstate="collapsed" desc=" Generated Documentation ">
/**
 * Runtime {@code ImplementationReference}.
 *
 * <p>
 *   This implementation is identified by {@code <org.jomc.ri.model.RuntimeImplementationReference>}.
 * </p>
 * <p>
 *   It provides objects named {@code <JOMC RI RuntimeImplementationReference>} of the following specifications:
 *
 *   <ul>
 *     <li>{@code <org.jomc.ri.model.RuntimeModelObject>} at specification level 1.2.</li>
 *   </ul>
 * </p>
 *
 * @author <a href="mailto:schulte2005@users.sourceforge.net">Christian Schulte</a> 1.2
 * @version 1.2
 */
// </editor-fold>
// SECTION-END
// SECTION-START[Annotations]
// <editor-fold defaultstate="collapsed" desc=" Generated Annotations ">
@javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
// </editor-fold>
// SECTION-END
public class RuntimeImplementationReference extends ImplementationReference implements RuntimeModelObject
{
    // SECTION-START[RuntimeImplementationReference]

    /**
     * Creates a new {@code RuntimeImplementationReference} instance by deeply copying a given
     * {@code ImplementationReference} instance.
     *
     * @param reference The instance to copy.
     *
     * @throws NullPointerException if {@code reference} is {@code null}.
     */
    public RuntimeImplementationReference( final ImplementationReference reference )
    {
        super( reference );

        if ( this.getAuthors() != null )
        {
            this.setAuthors( RuntimeModelObjects.getInstance().copyOf( this.getAuthors() ) );
        }
        if ( this.getDocumentation() != null )
        {
            this.setDocumentation( RuntimeModelObjects.getInstance().copyOf( this.getDocumentation() ) );
        }
    }

    // SECTION-END
    // SECTION-START[RuntimeModelObject]
    public void gc()
    {
        this.gcOrClear( true, false );
    }

    public void clear()
    {
        this.gcOrClear( false, true );
    }

    private void gcOrClear( final boolean gc, final boolean clear )
    {
        if ( this.getAuthors() instanceof RuntimeModelObject )
        {
            if ( gc )
            {
                ( (RuntimeModelObject) this.getAuthors() ).gc();
            }
            if ( clear )
            {
                ( (RuntimeModelObject) this.getAuthors() ).clear();
            }
        }
        if ( this.getDocumentation() instanceof RuntimeModelObject )
        {
            if ( gc )
            {
                ( (RuntimeModelObject) this.getDocumentation() ).gc();
            }
            if ( clear )
            {
                ( (RuntimeModelObject) this.getDocumentation() ).clear();
            }
        }
    }

    // SECTION-END
    // SECTION-START[Constructors]
    // <editor-fold defaultstate="collapsed" desc=" Generated Constructors ">
    /** Creates a new {@code RuntimeImplementationReference} instance. */
    @javax.annotation.Generated( value = "org.jomc.tools.SourceFileProcessor 1.2-SNAPSHOT", comments = "See http://jomc.sourceforge.net/jomc/1.2/jomc-tools-1.2-SNAPSHOT" )
    public RuntimeImplementationReference()
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