package com.easybot.hardwarestore.api.mapper;

import com.easybot.hardwarestore.api.mapper.marker.DtoMarker;
import com.easybot.hardwarestore.api.mapper.marker.EntityMarker;

public interface EntityMapper<E extends EntityMarker, D extends DtoMarker> {
    E toEntity(D dto);
    D fromEntity(E entity);
}
