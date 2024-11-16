package ru.tbank.education.school.lesson7

import java.time.LocalDate

/**
 * Моделька данных вклада.
 * У одного пользователя может быть много вклад.
 * Доступны только рублевые вклад.
 */
data class Deposit(
    /**
     * Уникальный идентификатор вклада.
     * Указан в договоре, поэтому не может меняться.
     */
    val id: Long,
    /**
     Начальный депозит в рублях.
     Последующее пополнение или частичное изъятие невозможно.
     */
    val initialDeposit: Int,
    /**
     * Дата открытия вклада.
     */
    var createAt: LocalDate,
    /**
     * Длительность вклада в месяцах.
     */
    val durationMonth: Int,
    /**
     * * При начислении процентов на вклад в
     * банк принято рассчитывать сложный процент.
     * Смотри "капитализация вклада".
     * Капитализация происходит каждый день.
     * Ставка в процентах,
     * дроби процентов не допускаются.
     */

    val complexPercent: Double,
    /**
     * * Для премиальных клиентов банка нa
     * вклад в конце каждого месяца помимо проценто
     * начисляется вознаграждение 1% от суммы вклада.
     */

    val isVip: Int,
)
