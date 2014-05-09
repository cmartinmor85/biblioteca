package es.tri.dao;

import es.tri.dao.model.TriTBioUsuario;

public interface TriTBioUsuarioMapper {
    int deleteByPrimaryKey(Integer id_usuario);

    int insert(TriTBioUsuario record);

    int insertSelective(TriTBioUsuario record);

    TriTBioUsuario selectByPrimaryKey(Integer id_usuario);

    int updateByPrimaryKeySelective(TriTBioUsuario record);

    int updateByPrimaryKey(TriTBioUsuario record);
}