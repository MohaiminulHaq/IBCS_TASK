package com.example.ibcstextDemo.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Setter
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

  /*  @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;*/

    private static final long serialVersionUID = 1L;

    /**
     * id of persisted entity.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;



}
