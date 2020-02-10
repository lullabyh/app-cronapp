package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PARTICIPANTEDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PARTICIPANTEDAO extends JpaRepository<PARTICIPANTE, java.lang.String> {

  /**
   * Obtém a instância de PARTICIPANTE utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PARTICIPANTE entity WHERE entity.id = :id")
  public PARTICIPANTE findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de PARTICIPANTE utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PARTICIPANTE entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PALESTRA entity WHERE entity.participante.id = :id")
  public Page<PALESTRA> findPALESTRA(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PARTICIPANTEPALESTRA entity WHERE entity.paRTICIPANTE.id = :id")
  public Page<PARTICIPANTEPALESTRA> findPARTICIPANTEPALESTRA(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.paRTICIPANTE.id = :id")
  public Page<User> findUser(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.paLESTRA FROM PARTICIPANTEPALESTRA entity WHERE entity.paRTICIPANTE.id = :id")
  public Page<PALESTRA> listPALESTRA_2(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM PARTICIPANTEPALESTRA entity WHERE entity.paRTICIPANTE.id = :instanceId AND entity.paLESTRA.id = :relationId")
  public int deletePALESTRA_2(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key usuario
   * @generated
   */
  @Query("SELECT entity FROM PARTICIPANTE entity WHERE entity.usuario.id = :id")
  public Page<PARTICIPANTE> findPARTICIPANTEsByUsuario(@Param(value="id") java.lang.String id, Pageable pageable);

}
