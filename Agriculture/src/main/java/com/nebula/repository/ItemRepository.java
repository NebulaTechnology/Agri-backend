package com.nebula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nebula.entity.Item;
@Repository
public interface ItemRepository extends JpaRepository <Item, Long>
{

}
