package com.example.decentwork.data

/**
 * Sample data for the Decent Work and Economic Growth app
 * This object provides mock data for demonstration purposes
 */
object SampleData {

    /**
     * Sample job listings with fair wages and decent work conditions
     */
    val jobs = listOf(
        Job(
            id = 1,
            title = "Software Developer",
            company = "Tech Solutions Inc.",
            location = "Remote",
            salary = "100,000-120,000 ksh monthly",
            type = JobType.REMOTE,
            description = "Join our team to develop innovative software solutions that promote sustainable economic growth. Work on projects that make a real difference in people's lives while enjoying the flexibility of remote work. You'll collaborate with a diverse team of developers, designers, and product managers to build applications that support UN Sustainable Development Goals.",
            requirements = listOf(
                "3+ years of professional software development experience",
                "Strong proficiency in Kotlin and Java programming languages",
                "Experience with Android development and Jetpack Compose",
                "Excellent problem-solving and analytical skills",
                "Strong communication skills and team player mindset",
                "Bachelor's degree in Computer Science or related field"
            ),
            benefits = listOf(
                "Comprehensive health, dental, and vision insurance",
                "Flexible working hours and remote work options",
                "Professional development budget ($2,000/year)",
                "Remote work equipment and home office stipend",
                "Annual performance bonuses up to 15%",
                "4 weeks paid vacation plus holidays"
            ),
            postedDate = "2 days ago"
        ),
        Job(
            id = 2,
            title = "Community Organizer",
            company = "Fair Work Alliance",
            location = "Kisumu , Kenya",
            salary = "90,000- 120,000 ksh monthly",
            type = JobType.FULL_TIME,
            description = "Advocate for worker rights and organize community initiatives for decent work conditions. Lead grassroots campaigns and build coalitions to improve workplace standards. You'll work directly with workers, unions, and community organizations to promote fair labor practices and economic justice.",
            requirements = listOf(
                "Passion for social justice and workers' rights",
                "Strong communication and public speaking skills",
                "Event planning and coordination experience",
                "Ability to work with diverse communities and stakeholders",
                "Bilingual skills (English/Spanish) preferred",
                "Experience in community organizing or advocacy"
            ),
            benefits = listOf(
                "Paid time off (3 weeks) and sick leave",
                "Training and leadership development opportunities",
                "Impact-driven meaningful work",
                "Supportive team environment",
                "Union representation and collective bargaining",
                "Health insurance and retirement plan"
            ),
            postedDate = "1 week ago"
        ),
        Job(
            id = 3,
            title = "Data Analyst",
            company = "Economic Research Group",
            location = "Nairobi, Kenya",
            salary = "130,000- 150,000 monthly",
            type = JobType.FULL_TIME,
            description = "Analyze economic data to support policy recommendations for sustainable growth. Work with government agencies and NGOs to promote evidence-based economic policies. You'll conduct research on employment trends, wage inequality, and economic development to inform policy decisions.",
            requirements = listOf(
                "Bachelor's degree in Economics, Statistics, or related field",
                "Proficiency in Python, R, and SQL for data analysis",
                "Strong analytical and critical thinking skills",
                "Experience with data visualization tools (Tableau, Power BI)",
                "Understanding of economic principles and labor markets",
                "Excellent written and verbal communication skills"
            ),
            benefits = listOf(
                "Research and conference budget",
                "Conference attendance and networking opportunities",
                "Mentorship program with senior economists",
                "Publication support and academic collaboration",
                "Retirement plan with 5% employer matching",
                "Professional development and continuing education"
            ),
            postedDate = "3 days ago"
        ),
        Job(
            id = 4,
            title = "Skills Trainer",
            company = "Workforce Development Center",
            location = "Nakuru, Kenya",
            salary = "60,000-70,000 ksh monthly",
            type = JobType.PART_TIME,
            description = "Provide vocational training to help individuals gain employment skills. Empower job seekers with practical skills and confidence to succeed in the workforce. You'll design and deliver training programs in areas such as digital literacy, customer service, and workplace communication.",
            requirements = listOf(
                "Teaching or training experience (2+ years)",
                "Industry expertise in a specific vocational field",
                "Patient and encouraging teaching style",
                "Curriculum development and instructional design skills",
                "Commitment to adult education and workforce development",
                "Ability to work with diverse learners"
            ),
            benefits = listOf(
                "Flexible schedule (20-30 hours per week)",
                "Professional growth and training opportunities",
                "Community impact and personal fulfillment",
                "Training materials and resources provided",
                "Collaborative and supportive work environment",
                "Hourly rate with potential for full-time"
            ),
            postedDate = "5 days ago"
        ),
        Job(
            id = 5,
            title = "HR Compliance Specialist",
            company = "Global Enterprises",
            location = "Nairobi, Kenya",
            salary = "80,000- 90,000 Ksh monthly",
            type = JobType.FULL_TIME,
            description = "Ensure workplace compliance with labor laws and promote fair employment practices. Champion decent work standards across the organization. You'll conduct audits, develop policies, and provide training to ensure the company maintains the highest standards of workplace fairness and safety.",
            requirements = listOf(
                "HR certification (PHR, SPHR, or SHRM-CP preferred)",
                "In-depth knowledge of labor laws and regulations",
                "5+ years of HR experience with focus on compliance",
                "Strong attention to detail and analytical skills",
                "Excellent interpersonal and communication skills",
                "Experience conducting workplace investigations"
            ),
            benefits = listOf(
                "Full benefits package (health, dental, vision, life)",
                "Professional certification support and reimbursement",
                "Work-life balance initiatives and flexible scheduling",
                "Career advancement opportunities within HR",
                "Employee wellness programs and gym membership",
                "401(k) with company match and profit sharing"
            ),
            postedDate = "4 day ago"
        ),
    )

    /**
     * Economic indicators tracking key metrics for decent work and economic growth
     */
    val economicIndicators = listOf(
        EconomicIndicator(
            name = "Unemployment Rate",
            value = "3.8%",
            trend = TrendType.DOWN,
            description = "Percentage of the labor force actively seeking employment but unable to find work",
            changePercent = "-0.2%"
        ),
        EconomicIndicator(
            name = "GDP Growth",
            value = "2.4%",
            trend = TrendType.UP,
            description = "Annual economic growth rate measuring the increase in goods and services produced",
            changePercent = "+0.3%"
        ),
        EconomicIndicator(
            name = "Minimum Wage",
            value = "ksh 60000/month",
            trend = TrendType.STABLE,
            description = "Federal minimum wage standard ensuring fair compensation for workers",
            changePercent = "0%"
        ),
        EconomicIndicator(
            name = "Labor Force Participation",
            value = "63.2%",
            trend = TrendType.UP,
            description = "Percentage of working-age population that is employed or actively seeking work",
            changePercent = "+0.5%"
        ),
        EconomicIndicator(
            name = "Average Weekly Earnings",
            value = "ksh 20000",
            trend = TrendType.UP,
            description = "Average earnings for all private sector workers, indicating wage growth",
            changePercent = "+2.1%"
        ),
        EconomicIndicator(
            name = "Job Openings",
            value = "9.6M",
            trend = TrendType.STABLE,
            description = "Total number of job openings nationwide, indicating labor demand",
            changePercent = "-0.1%"
        ),
        EconomicIndicator(
            name = "Youth Unemployment",
            value = "10%",
            trend = TrendType.DOWN,
            description = "Unemployment rate for workers aged 16-24, a key indicator of economic opportunity",
            changePercent = "-0.4%"
        ),
        EconomicIndicator(
            name = "Income Inequality (Gini)",
            value = "0.41",
            trend = TrendType.STABLE,
            description = "Measure of income distribution, where 0 is perfect equality and 1 is perfect inequality",
            changePercent = "0%"
        )
    )

    /**
     * Worker rights information covering key protections and entitlements
     */
    val workerRights = listOf(
        WorkerRight(
            title = "Safe Working Conditions",
            description = "Every worker has the right to a safe and healthy workplace free from recognized hazards. Employers must provide proper safety equipment, training, and maintain safe working environments.",
            category = RightCategory.SAFETY,
            details = listOf(
                "Employers must provide proper personal protective equipment (PPE) at no cost",
                "Regular safety training and hazard communication is required",
                "Workers can refuse unsafe work without fear of retaliation",
                "OSHA standards must be followed and enforced",
                "Right to report safety violations anonymously",
                "Access to workplace injury and illness records"
            )
        ),
        WorkerRight(
            title = "Fair Wages",
            description = "Workers are entitled to fair compensation that meets or exceeds minimum wage standards. This includes proper payment for all hours worked and overtime compensation.",
            category = RightCategory.COMPENSATION,
            details = listOf(
                "Minimum wage must be paid for all hours worked",
                "Overtime pay at 1.5x regular rate for hours over 40 per week",
                "Equal pay for equal work regardless of gender, race, or other protected characteristics",
                "Timely payment of wages on regular schedule",
                "Protection against wage theft and illegal deductions",
                "Right to receive detailed pay stubs showing hours and deductions"
            )
        ),
        WorkerRight(
            title = "Reasonable Working Hours",
            description = "Standard work weeks should not exceed 40 hours with appropriate overtime compensation. Workers are entitled to rest breaks and limits on excessive working hours.",
            category = RightCategory.WORKING_HOURS,
            details = listOf(
                "Maximum 40 hours per week as standard workweek",
                "Overtime pay at 1.5x regular rate for additional hours",
                "Required rest breaks during shifts (typically 10-15 minutes per 4 hours)",
                "Meal breaks for shifts over 6 hours",
                "Limits on consecutive work days without rest",
                "Protection against forced overtime in many industries"
            )
        ),
        WorkerRight(
            title = "Freedom of Association",
            description = "Workers have the fundamental right to form and join unions for collective bargaining. This includes protection from employer retaliation for union activities.",
            category = RightCategory.RIGHTS,
            details = listOf(
                "Right to organize and join labor unions",
                "Protection from anti-union discrimination and retaliation",
                "Collective bargaining rights to negotiate wages and conditions",
                "Right to strike under certain legal conditions",
                "Right to union representation in workplace disputes",
                "Protection of union activities and organizing efforts"
            )
        ),
        WorkerRight(
            title = "Non-Discrimination",
            description = "Equal opportunity employment regardless of race, color, religion, sex, national origin, age, disability, or genetic information. Workers are protected from discrimination in all aspects of employment.",
            category = RightCategory.EQUALITY,
            details = listOf(
                "Protection from discrimination in hiring, firing, and promotion",
                "Equal treatment in pay, benefits, and working conditions",
                "Reasonable accommodations for disabilities and religious practices",
                "Protection from harassment based on protected characteristics",
                "Right to file complaints with EEOC for discrimination",
                "Protection against retaliation for reporting discrimination"
            )
        ),
        WorkerRight(
            title = "Family and Medical Leave",
            description = "Eligible workers can take unpaid, job-protected leave for specified family and medical reasons. This ensures workers can care for themselves and family members without losing their jobs.",
            category = RightCategory.RIGHTS,
            details = listOf(
                "Up to 12 weeks of unpaid leave per year for eligible workers",
                "Job protection and restoration to same or equivalent position",
                "Continued health insurance coverage during leave",
                "Leave for birth, adoption, or foster care placement",
                "Leave for serious health condition of employee or family member",
                "Leave to care for military service member family"
            )
        ),
        WorkerRight(
            title = "Protection from Harassment",
            description = "Workers have the right to a workplace free from harassment, bullying, and hostile work environments. Employers must take action to prevent and address harassment.",
            category = RightCategory.SAFETY,
            details = listOf(
                "Protection from sexual harassment and unwelcome conduct",
                "Right to work environment free from bullying and intimidation",
                "Employer must have anti-harassment policies and procedures",
                "Right to report harassment without retaliation",
                "Employer must investigate and address complaints promptly",
                "Access to legal remedies for harassment violations"
            )
        ),
        WorkerRight(
            title = "Whistleblower Protection",
            description = "Workers who report illegal activities, safety violations, or fraud are protected from retaliation. This encourages reporting of wrongdoing without fear of job loss.",
            category = RightCategory.RIGHTS,
            details = listOf(
                "Protection from retaliation for reporting violations",
                "Right to report to government agencies and regulators",
                "Protection for refusing to participate in illegal activities",
                "Remedies available if retaliation occurs",
                "Confidentiality protections for whistleblowers",
                "Legal protections under various federal and state laws"
            )
        )
    )

    /**
     * Career resources for skill development and professional growth
     */
    val careerResources = listOf(
        CareerResource(
            title = "Digital Skills Training",
            description = "Free online courses in coding, digital marketing, web development, and data analysis to boost your career in the digital economy. Learn in-demand skills at your own pace.",
            type = ResourceType.TRAINING,
            duration = "8-12 weeks",
            provider = "Tech Education Foundation"
        ),
        CareerResource(
            title = "Resume Building Workshop",
            description = "Learn to create compelling resumes and cover letters that get noticed by employers. Get personalized feedback and tips from career counselors.",
            type = ResourceType.WORKSHOP,
            duration = "2 hours",
            provider = "Career Success Center"
        ),
        CareerResource(
            title = "Professional Certification Programs",
            description = "Industry-recognized certifications in project management (PMP), IT (CompTIA, Cisco), healthcare (CNA, Medical Coding), and more. Financial aid available.",
            type = ResourceType.CERTIFICATION,
            duration = "3-6 months",
            provider = "Professional Development Institute"
        ),
        CareerResource(
            title = "Interview Preparation",
            description = "Mock interviews and expert tips for successful job interviews and salary negotiations. Practice common interview questions and receive constructive feedback.",
            type = ResourceType.TRAINING,
            duration = "4 weeks",
            provider = "Job Readiness Academy"
        ),
        CareerResource(
            title = "Entrepreneurship Bootcamp",
            description = "Start your own business with guidance from successful entrepreneurs and business experts. Learn business planning, financing, marketing, and operations.",
            type = ResourceType.EDUCATION,
            duration = "10 weeks",
            provider = "Small Business Development Center"
        ),
        CareerResource(
            title = "Leadership Development",
            description = "Develop essential leadership skills for career advancement and team management. Learn communication, decision-making, conflict resolution, and strategic thinking.",
            type = ResourceType.TRAINING,
            duration = "6 weeks",
            provider = "Leadership Excellence Program"
        ),
        CareerResource(
            title = "Financial Literacy Course",
            description = "Learn budgeting, saving, investing, and debt management to achieve financial security and independence. Understand credit, taxes, and retirement planning.",
            type = ResourceType.EDUCATION,
            duration = "4 weeks",
            provider = "Financial Empowerment Network"
        ),
        CareerResource(
            title = "English as a Second Language (ESL)",
            description = "Improve your English language skills for better job opportunities. Classes cover workplace communication, business English, and professional vocabulary.",
            type = ResourceType.EDUCATION,
            duration = "12 weeks",
            provider = "Community Education Center"
        ),
        CareerResource(
            title = "Networking Skills Workshop",
            description = "Learn effective networking strategies to build professional relationships and discover job opportunities. Practice elevator pitches and LinkedIn optimization.",
            type = ResourceType.WORKSHOP,
            duration = "3 hours",
            provider = "Professional Network Alliance"
        ),
        CareerResource(
            title = "Trade Skills Apprenticeship",
            description = "Earn while you learn in skilled trades like electrical, plumbing, HVAC, and carpentry. Paid apprenticeships with experienced mentors leading to certification.",
            type = ResourceType.TRAINING,
            duration = "2-4 years",
            provider = "Trades Union Apprenticeship Program"
        )
    )
}
