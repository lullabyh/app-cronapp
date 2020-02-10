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
@Repository("EVENTODAO")
@Transactional(transactionManager="app-TransactionManager")
public interface EVENTODAO extends JpaRepository<EVENTO, java.math.BigInteger> {

  /**
   * Obtém a instância de EVENTO utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM EVENTO entity WHERE entity.id = :id")
  public EVENTO findOne(@Param(value="id") java.math.BigInteger id);

  /**
   * Remove a instância de EVENTO utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM EVENTO entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.math.BigInteger id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PALESTRA entity WHERE entity.evENTO.id = :id")
  public Page<PALESTRA> findPALESTRA(@Param(value="id") java.math.BigInteger id, Pageable pageable);

  /**
   * Foreign Key palestra
   * @generated
   */
  @Query("SELECT entity FROM EVENTO entity WHERE entity.palestra.id = :id")
  public Page<EVENTO> findEVENTOsByPalestra(@Param(value="id") java.lang.String id, Pageable pageable);

}
