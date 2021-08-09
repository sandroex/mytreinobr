package br.com.mytreinobr.core.model.training

import br.com.mytreinobr.core.model.type.TypeTraining

data class TrainingBuilding(val dayTraining: TrainingDay, val cardio: CardioDay?, val type: TypeTraining?) {}