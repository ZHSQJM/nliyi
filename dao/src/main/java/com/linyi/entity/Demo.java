package com.linyi.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @project: linyi-parent
 * @author: zhs
 * @date: 2019/4/23 15:47
 * @package: com.linyi.entity
 * @description:
 */

@Data
@Entity
@Table(name = "demo")
@Accessors(chain = true)
public class Demo {

    @Id
    @GeneratedValue
    private  Integer id;

    private  String userName;

}
