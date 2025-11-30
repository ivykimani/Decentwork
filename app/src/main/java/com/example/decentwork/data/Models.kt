package com.example.decentwork.data

data class Job(
    val id: Int,
    val title: String,
    val company: String,
    val location: String,
    val salary: String,
    val type: JobType,
    val description: String,
    val requirements: List<String>,
    val benefits: List<String>,
    val postedDate: String
)

enum class JobType {
    FULL_TIME,
    PART_TIME,
    CONTRACT,
    REMOTE;

    fun displayName(): String = when (this) {
        FULL_TIME -> "Full-time"
        PART_TIME -> "Part-time"
        CONTRACT -> "Contract"
        REMOTE -> "Remote"
    }
}

data class EconomicIndicator(
    val name: String,
    val value: String,
    val trend: TrendType,
    val description: String,
    val changePercent: String
)

enum class TrendType {
    UP, DOWN, STABLE
}

data class WorkerRight(
    val title: String,
    val description: String,
    val category: RightCategory,
    val details: List<String>
)

enum class RightCategory(val displayName: String) {
    SAFETY("Safety"),
    COMPENSATION("Compensation"),
    WORKING_HOURS("Working Hours"),
    RIGHTS("Rights"),
    EQUALITY("Equality")
}

data class CareerResource(
    val title: String,
    val description: String,
    val type: ResourceType,
    val duration: String,
    val provider: String
)

enum class ResourceType(val displayName: String) {
    TRAINING("Training"),
    EDUCATION("Education"),
    CERTIFICATION("Certification"),
    WORKSHOP("Workshop")
}
