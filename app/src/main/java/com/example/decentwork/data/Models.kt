package com.example.decentwork.data

import android.net.Uri

enum class JobType { FULL_TIME, PART_TIME, CONTRACT, REMOTE }

data class Job(
    val id: String,
    val title: String,
    val company: String,
    val location: String,
    val jobType: JobType,
    val salary: String?,
    val description: String,
    val requirements: List<String>,
    val benefits: List<String>,
    val applyUrl: String? = null
)

enum class Trend { UP, DOWN, STABLE }

data class EconomicIndicator(
    val id: String,
    val name: String,
    val value: String,
    val trend: Trend,
    val lastUpdated: String
)

data class WorkerRight(
    val id: String,
    val title: String,
    val category: String,
    val summary: String,
    val details: String
)

data class CareerResource(
    val id: String,
    val title: String,
    val provider: String,
    val duration: String,
    val description: String,
    val url: String? = null
)

