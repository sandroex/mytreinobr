package br.com.mytreinobr.core.model.week

import br.com.mytreinobr.core.model.training.TrainingBuilding

data class Week(val day: List<TrainingBuilding> = ArrayList()) {}