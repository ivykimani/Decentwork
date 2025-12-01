package com.example.decentwork.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

object DataRepository {

    // Sample jobs
    private val jobs = listOf(
        Job(
            id = "job1",
            title = "Junior Software Developer",
            company = "TechCo",
            location = "Nairobi",
            jobType = JobType.FULL_TIME,
            salary = "KES 70,000",
            description = "Work on mobile apps using Kotlin and Compose.",
            requirements = listOf("Kotlin", "Git", "Team player"),
            benefits = listOf("Health insurance", "Pension"),
            applyUrl = "https://example.com/apply/job1"
        ),
        Job(
            id = "job2",
            title = "Remote Customer Support",
            company = "Service Ltd",
            location = "Remote",
            jobType = JobType.REMOTE,
            salary = "KES 30,000",
            description = "Provide support across channels.",
            requirements = listOf("Communication", "English"),
            benefits = listOf("Flexible hours"),
            applyUrl = "https://example.com/apply/job2"
        )
    )

    // Sample indicators
    private val indicators = listOf(
        EconomicIndicator("ind1", "Unemployment Rate", "8.2%", Trend.DOWN, "2025-11-01"),
        EconomicIndicator("ind2", "GDP Growth (YoY)", "3.5%", Trend.UP, "2025-09-30"),
        EconomicIndicator("ind3", "Labor Force Participation", "62.1%", Trend.STABLE, "2025-10-15")
    )

    // Sample rights
    private val rights = listOf(
        WorkerRight(
            "r1",
            "Safety & Health",
            "Safety",
            "Right to a safe workplace.",
            "Employers must provide protective equipment and training. Report unsafe conditions to authorities."
        ),
        WorkerRight(
            "r2",
            "Fair Compensation",
            "Compensation",
            "Right to receive fair wages.",
            "Matches minimum wage laws, overtime pay, and transparent payroll."
        )
    )

    // Sample resources
    private val resources = listOf(
        CareerResource(
            "c1",
            "Android Development Bootcamp",
            "DevSchool",
            "8 weeks",
            "Hands-on course covering Kotlin and Jetpack Compose.",
            "https://example.com/android-bootcamp"
        ),
        CareerResource(
            "c2",
            "職業訓練", // example multi-language title
            "Skill Center",
            "4 weeks",
            "Short vocational training programs."
        )
    )

    // Simulated network/disk access
    suspend fun getJobs(): List<Job> = withContext(Dispatchers.IO) {
        delay(300) // simulate latency
        jobs
    }

    suspend fun getJobById(id: String): Job? = withContext(Dispatchers.IO) {
        delay(150)
        jobs.find { it.id == id }
    }

    suspend fun getIndicators(): List<EconomicIndicator> = withContext(Dispatchers.IO) {
        delay(250)
        indicators
    }

    suspend fun getRights(): List<WorkerRight> = withContext(Dispatchers.IO) {
        delay(200)
        rights
    }

    suspend fun getResources(): List<CareerResource> = withContext(Dispatchers.IO) {
        delay(200)
        resources
    }

    // Very simple filter demonstration
    suspend fun filterJobs(jobType: JobType?): List<Job> = withContext(Dispatchers.IO) {
        delay(150)
        if (jobType == null) jobs else jobs.filter { it.jobType == jobType }
    }
}
