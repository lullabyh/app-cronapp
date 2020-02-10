package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PARTICIPANTEPALESTRA
 * @generated
 */
@Entity
@Table(name = "\"PARTICIPANTEPALESTRA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PARTICIPANTEPALESTRA")
public class PARTICIPANTEPALESTRA implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_PARTICIPANTE", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PARTICIPANTE paRTICIPANTE;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_PALESTRA", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PALESTRA paLESTRA;

  /**
   * Construtor
   * @generated
   */
  public PARTICIPANTEPALESTRA(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public PARTICIPANTEPALESTRA setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém paRTICIPANTE
   * return paRTICIPANTE
   * @generated
   */
  
  public PARTICIPANTE getPaRTICIPANTE(){
    return this.paRTICIPANTE;
  }

  /**
   * Define paRTICIPANTE
   * @param paRTICIPANTE paRTICIPANTE
   * @generated
   */
  public PARTICIPANTEPALESTRA setPaRTICIPANTE(PARTICIPANTE paRTICIPANTE){
    this.paRTICIPANTE = paRTICIPANTE;
    return this;
  }

  /**
   * Obtém paLESTRA
   * return paLESTRA
   * @generated
   */
  
  public PALESTRA getPaLESTRA(){
    return this.paLESTRA;
  }

  /**
   * Define paLESTRA
   * @param paLESTRA paLESTRA
   * @generated
   */
  public PARTICIPANTEPALESTRA setPaLESTRA(PALESTRA paLESTRA){
    this.paLESTRA = paLESTRA;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PARTICIPANTEPALESTRA object = (PARTICIPANTEPALESTRA)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
