package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EVENTO
 * @generated
 */
@Entity
@Table(name = "\"EVENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.EVENTO")
public class EVENTO implements Serializable {

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
  private java.math.BigInteger id;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="palestra", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private PALESTRA palestra;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "inicio", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date inicio;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "fim", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date fim;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
   * Construtor
   * @generated
   */
  public EVENTO(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.math.BigInteger getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public EVENTO setId(java.math.BigInteger id){
    this.id = id;
    return this;
  }

  /**
   * Obtém palestra
   * return palestra
   * @generated
   */
  
  public PALESTRA getPalestra(){
    return this.palestra;
  }

  /**
   * Define palestra
   * @param palestra palestra
   * @generated
   */
  public EVENTO setPalestra(PALESTRA palestra){
    this.palestra = palestra;
    return this;
  }

  /**
   * Obtém inicio
   * return inicio
   * @generated
   */
  
  public java.util.Date getInicio(){
    return this.inicio;
  }

  /**
   * Define inicio
   * @param inicio inicio
   * @generated
   */
  public EVENTO setInicio(java.util.Date inicio){
    this.inicio = inicio;
    return this;
  }

  /**
   * Obtém fim
   * return fim
   * @generated
   */
  
  public java.util.Date getFim(){
    return this.fim;
  }

  /**
   * Define fim
   * @param fim fim
   * @generated
   */
  public EVENTO setFim(java.util.Date fim){
    this.fim = fim;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public EVENTO setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    EVENTO object = (EVENTO)obj;
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
