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
@Repository("PALESTRADAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PALESTRADAO extends JpaRepository<PALESTRA, java.lang.String> {

  /**
   * Obtém a instância de PALESTRA utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM PALESTRA entity WHERE entity.id = :id")
  public PALESTRA findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de PALESTRA utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM PALESTRA entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM EVENTO entity WHERE entity.palestra.id = :id")
  public Page<EVENTO> findEVENTO(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PARTICIPANTEPALESTRA entity WHERE entity.paLESTRA.id = :id")
  public Page<PARTICIPANTEPALESTRA> findPARTICIPANTEPALESTRA(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.paRTICIPANTE FROM PARTICIPANTEPALESTRA entity WHERE entity.paLESTRA.id = :id")
  public Page<PARTICIPANTE> listPARTICIPANTE(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM PARTICIPANTEPALESTRA entity WHERE entity.paLESTRA.id = :instanceId AND entity.paRTICIPANTE.id = :relationId")
  public int deletePARTICIPANTE(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key participante
   * @generated
   */
  @Query("SELECT entity FROM PALESTRA entity WHERE entity.participante.id = :id")
  public Page<PALESTRA> findPALESTRAsByParticipante(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key paLESTRANTE
   * @generated
   */
  @Query("SELECT entity FROM PALESTRA entity WHERE entity.paLESTRANTE.id = :id")
  public Page<PALESTRA> findPALESTRAsByPaLESTRANTE(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key evENTO
   * @generated
   */
  @Query("SELECT entity FROM PALESTRA entity WHERE entity.evENTO.id = :id")
  public Page<PALESTRA> findPALESTRAsByEvENTO(@Param(value="id") java.math.BigInteger id, Pageable pageable);

}
