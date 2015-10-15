/*
 * Copyright 2015 Open mHealth
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openmhealth.shimmer.common.service;

import org.openmhealth.shimmer.common.configuration.EndpointConfigurationProperties;
import org.openmhealth.shimmer.common.domain.ProcessedResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


/**
 * @author Chris Schaefbauer
 */
public class ResponseProcessorImpl<T> implements ResponseProcessor<T> {

    @Override
    public ProcessedResponse processResponse(EndpointConfigurationProperties endpointProperties,
            ResponseEntity<?> responseEntity) {

        ProcessedResponse processedResponse = new ProcessedResponse();

        HttpStatus statusCode = responseEntity.getStatusCode();
//        if(!statusCode.is2xxSuccessful()){
//            //log issue
//            return ProcessedResponse.Error(statusCode);
//        }
//
//        processedResponse.setStatusCode(statusCode);
//
//        // Need to be able to get the shim and then its mappers
//        Shim targetShim = getShimByApiSourceName(endpointProperties.getApiSourceName());
//        DataPointMapper mapper = targetShim.getMapperForSchema();
//        List<DataPoint> dataPoints = mapper.asDataPoints(Collections.singletonList(responseEntity.getBody()));
//
//        processedResponse.setMappedData(dataPoints);
//
//        PaginationStatus paginationStatus =  ;
//        processedResponse.setPaginationStatus(paginationStatus);

        return processedResponse;
    }
}
