package es.tri.dao;

import es.tri.dao.model.TriTaTipoEntreno;

public interface TriTaTipoEntrenoMapper {
    int deleteByPrimaryKey(Integer id_tipo_entreno);

    int insert(TriTaTipoEntreno record);

    int insertSelective(TriTaTipoEntreno record);

    TriTaTipoEntreno selectByPrimaryKey(Integer id_tipo_entreno);

    int updateByPrimaryKeySelective(TriTaTipoEntreno record);

    int updateByPrimaryKey(TriTaTipoEntreno record);
}