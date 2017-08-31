/*
 * Copyright (c) 2002-2017, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.elasticdata.modules.dansmarue.business;

import fr.paris.lutece.plugins.elasticdata.business.AbstractDataObject;
import java.sql.Date;

/**
 * SignalementDataObject
 */
public class SignalementDataObject extends AbstractDataObject
{

    // Variables declarations
    private int _nId;
    private Date _dateDateCreation;
    private Date _dateDatePrevueTraitement;
    private Location _location;
    private String _strCategory;
    private String _strHeureCreation;
    private String _strCanal;
    private String _strStatut;
    private String _strNumeroAnomalie;
    private String _strDescriptionPublic;

    /**
     * Returns the Id
     *
     * @return The Id
     */
    public int getId()
    {
        return _nId;
    }

    /**
     * Sets the Id
     *
     * @param nId The Id
     */
    public void setId( int nId )
    {
        _nId = nId;
    }

    /**
     * Returns the DateCreation
     *
     * @return The DateCreation
     */
    public Date getDateCreation()
    {
        return _dateDateCreation;
    }

    /**
     * Sets the DateCreation
     *
     * @param dateDateCreation The DateCreation
     */
    public void setDateCreation( Date dateDateCreation )
    {
        _dateDateCreation = dateDateCreation;
    }

    /**
     * Returns the DatePrevueTraitement
     *
     * @return The DatePrevueTraitement
     */
    public Date getDatePrevueTraitement()
    {
        return _dateDatePrevueTraitement;
    }

    /**
     * Sets the DatePrevueTraitement
     *
     * @param dateDatePrevueTraitement The DatePrevueTraitement
     */
    public void setDatePrevueTraitement( Date dateDatePrevueTraitement )
    {
        _dateDatePrevueTraitement = dateDatePrevueTraitement;
    }

    /**
     * Returns the Location
     *
     * @return The Location
     */
    public Location getLocation()
    {
        return _location;
    }

    /**
     * Sets the Location
     *
     * @param location The Location
     */
    public void setLocation( Location location )
    {
        _location = location;
    }

    /**
     * Returns the Category
     *
     * @return The Category
     */
    public String getCategory()
    {
        return _strCategory;
    }

    /**
     * Sets the Category
     *
     * @param strCategory The Category
     */
    public void setCategory( String strCategory )
    {
        _strCategory = strCategory;
    }

    /**
     * Returns the HeureCreation
     *
     * @return The HeureCreation
     */
    public String getHeureCreation()
    {
        return _strHeureCreation;
    }

    /**
     * Sets the HeureCreation
     *
     * @param strHeureCreation The HeureCreation
     */
    public void setHeureCreation( String strHeureCreation )
    {
        _strHeureCreation = strHeureCreation;
    }

    /**
     * Returns the Canal
     *
     * @return The Canal
     */
    public String getCanal()
    {
        return _strCanal;
    }

    /**
     * Sets the Canal
     *
     * @param strCanal The Canal
     */
    public void setCanal( String strCanal )
    {
        _strCanal = strCanal;
    }

    /**
     * Returns the Statut
     *
     * @return The Statut
     */
    public String getStatut()
    {
        return _strStatut;
    }

    /**
     * Sets the Statut
     *
     * @param strStatut The Statut
     */
    public void setStatut( String strStatut )
    {
        _strStatut = strStatut;
    }

    /**
     * Returns the NumeroAnomalie
     *
     * @return The NumeroAnomalie
     */
    public String getNumeroAnomalie()
    {
        return _strNumeroAnomalie;
    }

    /**
     * Sets the NumeroAnomalie
     *
     * @param strNumeroAnomalie The NumeroAnomalie
     */
    public void setNumeroAnomalie( String strNumeroAnomalie )
    {
        _strNumeroAnomalie = strNumeroAnomalie;
    }

    /**
     * Returns the DescriptionPublic
     *
     * @return The DescriptionPublic
     */
    public String getDescriptionPublic()
    {
        return _strDescriptionPublic;
    }

    /**
     * Sets the DescriptionPublic
     *
     * @param strDescriptionPublic The DescriptionPublic
     */
    public void setDescriptionPublic( String strDescriptionPublic )
    {
        _strDescriptionPublic = strDescriptionPublic;
    }

}
