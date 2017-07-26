/*
 * Copyright (c) 2017 Comvai, s.r.o. All Rights Reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.ctoolkit.agent.rest;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiReference;
import com.google.api.server.spi.config.DefaultValue;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import org.ctoolkit.agent.resource.ImportBatch;
import org.ctoolkit.agent.resource.ImportJob;

import java.util.List;

/**
 * Endpoint for import
 *
 * @author <a href="mailto:jozef.pohorelec@ctoolkit.org">Jozef Pohorelec</a>
 */
@Api
@ApiReference( AgentEndpointConfig.class )
public class ImportEndpoint
{
    // -- import CRUD

    @ApiMethod( name = "importBatch.insert", path = "import", httpMethod = ApiMethod.HttpMethod.POST )
    public ImportBatch insertImport( ImportBatch importBatch )
    {
        return null;
    }

    @ApiMethod( name = "importBatch.update", path = "import/{id}", httpMethod = ApiMethod.HttpMethod.PUT )
    public ImportBatch updateImport( @Named( "id" ) Long id, ImportBatch importBatch ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "importBatch.delete", path = "import/{id}", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void deleteImport( @Named( "id" ) Long id ) throws Exception
    {
    }

    @ApiMethod( name = "importBatch.get", path = "import/{id}", httpMethod = ApiMethod.HttpMethod.GET )
    public ImportBatch getImport( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "importBatch.list", path = "import", httpMethod = ApiMethod.HttpMethod.GET )
    @SuppressWarnings( "unchecked" )
    public List<ImportBatch> listImport( @DefaultValue( "0" ) @Nullable @Named( "start" ) Integer start,
                                         @DefaultValue( "10" ) @Nullable @Named( "length" ) Integer length,
                                         @Nullable @Named( "orderBy" ) String orderBy,
                                         @DefaultValue( "true" ) @Nullable @Named( "ascending" ) Boolean ascending )
            throws Exception
    {
        return null;
    }

    // -- import item CRUD

    @ApiMethod( name = "importBatch.item.insert", path = "import/{metadataId}/item", httpMethod = ApiMethod.HttpMethod.POST )
    public ImportBatch.ImportItem insertImportItem( @Named( "metadataId" ) Long metadataId, ImportBatch.ImportItem importBatchItem )
    {
        return null;
    }

    @ApiMethod( name = "importBatch.item.update", path = "import/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.PUT )
    public ImportBatch.ImportItem updateImportItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id, ImportBatch.ImportItem importBatchItem )
            throws Exception
    {
        return null;
    }

    @ApiMethod( name = "importBatch.item.delete", path = "import/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void deleteImportItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id )
            throws Exception
    {
    }

    @ApiMethod( name = "importBatch.item.get", path = "import/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.GET )
    public ImportBatch.ImportItem getImportItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id )
            throws Exception
    {
        return null;
    }

    // -- job CRUD

    @ApiMethod( name = "importBatch.job.start", path = "import/{id}/job", httpMethod = ApiMethod.HttpMethod.POST )
    public ImportJob startImportJob( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "importBatch.job.cancel", path = "import/{id}/job", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void cancelImportJob( @Named( "id" ) Long id ) throws Exception
    {
    }

    @ApiMethod( name = "importBatch.job.progress", path = "import/{id}/job", httpMethod = ApiMethod.HttpMethod.GET )
    public ImportJob getImportJob( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }
}
