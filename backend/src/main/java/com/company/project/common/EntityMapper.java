package com.company.project.common;

import java.util.List;

public interface EntityMapper<D, E> {
    E toEntity(D domain);
    D toDomain(E entity);
    List<D> toDomainList(List<E> entityList);
    List<E> toEntityList(List<D> domainList);
}
