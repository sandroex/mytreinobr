package br.com.mytreinobr.core.model.training

import br.com.mytreinobr.core.model.day.Day

data class TrainingDay(
    val day: Day,
    val exercise: String,
    val series: Int,
    val repetition: Int
) {}