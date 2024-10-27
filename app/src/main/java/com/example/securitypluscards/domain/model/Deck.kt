package com.example.securitypluscards.domain.model

import java.time.LocalDateTime

/**
 *
 * @userId
 * May get rid of the @userId property if there's no need for it;
 * I'm thinking about pulling it from the backend, so perhaps storing the userId
 * in the object itself isn't necessary, since we can just get it from the query.
 *
 * However, in the event that the user doesn't have access to a network
 * and pulls decks from their cached storage, would it make sense to have a
 * userId associated with that deck in order for a user to load their own decks
 * and not someone else's if there are multiple users on the same device using
 * the app?
 *
 * Need to think about this
 */
data class Deck(
    val id: Int,
//    val userId: Int,
    val name: String,
    val description: String,
    val cards: List<Card>,
    val category: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)