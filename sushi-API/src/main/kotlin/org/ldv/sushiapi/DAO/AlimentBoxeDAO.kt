package org.ldv.sushiapi.dao


import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AlimentBoxeDAO: JpaRepository<AlimentBoxeDAO, Long> {
}