package com.example.decentwork.data

/**
 * Central repository for accessing all app data
 * Delegates to SampleData for demonstration purposes
 * In a real app, this would fetch data from APIs or databases
 */
object DataRepository {
    
    /**
     * Get all available job listings
     */
    fun getJobs(): List<Job> = SampleData.jobs
    
    /**
     * Get economic indicators and metrics
     */
    fun getEconomicIndicators(): List<EconomicIndicator> = SampleData.economicIndicators
    
    /**
     * Get worker rights information
     */
    fun getWorkerRights(): List<WorkerRight> = SampleData.workerRights
    
    /**
     * Get career development resources
     */
    fun getCareerResources(): List<CareerResource> = SampleData.careerResources
    
    /**
     * Get a specific job by ID
     */
    fun getJobById(id: Int): Job? = SampleData.jobs.find { it.id == id }
}
