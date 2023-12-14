package my.project.aplication.system.exception

data class BusinessException(override val message: String?) : RuntimeException(message)