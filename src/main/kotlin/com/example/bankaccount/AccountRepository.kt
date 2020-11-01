package com.example.bankaccount

import com.sun.el.stream.Optional
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

interface AccountRepository : MongoRepository<Account, String> {

    fun findByDocument(document: String): java.util.Optional<Account>
}