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
import org.ctoolkit.agent.resource.ExportBatch;
import org.ctoolkit.agent.resource.ExportJob;

import java.util.List;

/**
 * Endpoint for export
 *
 * @author <a href="mailto:jozef.pohorelec@ctoolkit.org">Jozef Pohorelec</a>
 */
@Api
@ApiReference( AgentEndpointConfig.class )
public class ExportEndpoint
{
    // -- export CRUD

    @ApiMethod( name = "exportBatch.insert", path = "export", httpMethod = ApiMethod.HttpMethod.POST )
    public ExportBatch insertExport( ExportBatch exportBatch )
    {
        return null;
    }

    @ApiMethod( name = "exportBatch.update", path = "export/{id}", httpMethod = ApiMethod.HttpMethod.PUT )
    public ExportBatch updateExport( @Named( "id" ) Long id, ExportBatch exportBatch ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "exportBatch.delete", path = "export/{id}", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void deleteExport( @Named( "id" ) Long id ) throws Exception
    {
    }

    @ApiMethod( name = "exportBatch.get", path = "export/{id}", httpMethod = ApiMethod.HttpMethod.GET )
    public ExportBatch getExport( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "exportBatch.list", path = "export", httpMethod = ApiMethod.HttpMethod.GET )
    @SuppressWarnings( "unchecked" )
    public List<ExportBatch> listExport( @DefaultValue( "0" ) @Nullable @Named( "start" ) Integer start,
                                         @DefaultValue( "10" ) @Nullable @Named( "length" ) Integer length,
                                         @Nullable @Named( "orderBy" ) String orderBy,
                                         @DefaultValue( "true" ) @Nullable @Named( "ascending" ) Boolean ascending )
            throws Exception
    {
        return null;
    }

    // -- export item CRUD

    @ApiMethod( name = "exportBatch.item.insert", path = "export/{metadataId}/item", httpMethod = ApiMethod.HttpMethod.POST )
    public ExportBatch.ExportItem insertExportItem( @Named( "metadataId" ) Long metadataId, ExportBatch.ExportItem exportBatchItem )
    {
        return null;
    }

    @ApiMethod( name = "exportBatch.item.update", path = "export/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.PUT )
    public ExportBatch.ExportItem updateExportItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id, ExportBatch.ExportItem exportBatchItem )
            throws Exception
    {
        return null;
    }

    @ApiMethod( name = "exportBatch.item.delete", path = "export/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void deleteExportItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id )
            throws Exception
    {
    }

    @ApiMethod( name = "exportBatch.item.get", path = "export/{metadataId}/item/{id}", httpMethod = ApiMethod.HttpMethod.GET )
    public ExportBatch.ExportItem getExportItem( @Named( "metadataId" ) Long metadataId, @Named( "id" ) Long id )
            throws Exception
    {
        return null;
    }

    // -- job CRUD

    @ApiMethod( name = "exportBatch.job.start", path = "export/{id}/job", httpMethod = ApiMethod.HttpMethod.POST )
    public ExportJob startExportJob( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }

    @ApiMethod( name = "exportBatch.job.cancel", path = "export/{id}/job", httpMethod = ApiMethod.HttpMethod.DELETE )
    public void cancelExportJob( @Named( "id" ) Long id ) throws Exception
    {
    }

    @ApiMethod( name = "exportBatch.job.progress", path = "export/{id}/job", httpMethod = ApiMethod.HttpMethod.GET )
    public ExportJob getExportJob( @Named( "id" ) Long id ) throws Exception
    {
        return null;
    }
}
