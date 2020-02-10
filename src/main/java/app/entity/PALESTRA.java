package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PALESTRA
 * @generated
 */
@Entity
@Table(name = "\"PALESTRA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PALESTRA")
public class PALESTRA implements Serializable {

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
  @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String titulo;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "quantidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double quantidade;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="participante", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PARTICIPANTE participante;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_PALESTRANTE", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PALESTRANTE paLESTRANTE;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_EVENTO", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private EVENTO evENTO;

  /**
   * Construtor
   * @generated
   */
  public PALESTRA(){
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
  public PALESTRA setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém titulo
   * return titulo
   * @generated
   */
  
  public java.lang.String getTitulo(){
    return this.titulo;
  }

  /**
   * Define titulo
   * @param titulo titulo
   * @generated
   */
  public PALESTRA setTitulo(java.lang.String titulo){
    this.titulo = titulo;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public PALESTRA setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém quantidade
   * return quantidade
   * @generated
   */
  
  public java.lang.Double getQuantidade(){
    return this.quantidade;
  }

  /**
   * Define quantidade
   * @param quantidade quantidade
   * @generated
   */
  public PALESTRA setQuantidade(java.lang.Double quantidade){
    this.quantidade = quantidade;
    return this;
  }

  /**
   * Obtém participante
   * return participante
   * @generated
   */
  
  public PARTICIPANTE getParticipante(){
    return this.participante;
  }

  /**
   * Define participante
   * @param participante participante
   * @generated
   */
  public PALESTRA setParticipante(PARTICIPANTE participante){
    this.participante = participante;
    return this;
  }

  /**
   * Obtém paLESTRANTE
   * return paLESTRANTE
   * @generated
   */
  
  public PALESTRANTE getPaLESTRANTE(){
    return this.paLESTRANTE;
  }

  /**
   * Define paLESTRANTE
   * @param paLESTRANTE paLESTRANTE
   * @generated
   */
  public PALESTRA setPaLESTRANTE(PALESTRANTE paLESTRANTE){
    this.paLESTRANTE = paLESTRANTE;
    return this;
  }

  /**
   * Obtém evENTO
   * return evENTO
   * @generated
   */
  
  public EVENTO getEvENTO(){
    return this.evENTO;
  }

  /**
   * Define evENTO
   * @param evENTO evENTO
   * @generated
   */
  public PALESTRA setEvENTO(EVENTO evENTO){
    this.evENTO = evENTO;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PALESTRA object = (PALESTRA)obj;
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
