﻿using System;
using System.Collections.Generic;

namespace BlazorApp1.Models;

public partial class Personal
{
    public Personal(decimal personalId, string? currentFirstName, string? currentLastName, string? currentMiddleName, DateOnly? birthDate, string? socialSecurityNumber, string? driversLicense, string? currentAddress1, string? currentAddress2, string? currentCity, string? currentCountry, decimal? currentZip, string? currentGender, string? currentPhoneNumber, string? currentPersonalEmail, string? currentMaritalStatus, string? ethnicity, short? shareholderStatus, decimal? benefitPlanId)
    {
        PersonalId = personalId;
        CurrentFirstName = currentFirstName;
        CurrentLastName = currentLastName;
        CurrentMiddleName = currentMiddleName;
        BirthDate = birthDate;
        SocialSecurityNumber = socialSecurityNumber;
        DriversLicense = driversLicense;
        CurrentAddress1 = currentAddress1;
        CurrentAddress2 = currentAddress2;
        CurrentCity = currentCity;
        CurrentCountry = currentCountry;
        CurrentZip = currentZip;
        CurrentGender = currentGender;
        CurrentPhoneNumber = currentPhoneNumber;
        CurrentPersonalEmail = currentPersonalEmail;
        CurrentMaritalStatus = currentMaritalStatus;
        Ethnicity = ethnicity;
        ShareholderStatus = shareholderStatus;
        BenefitPlanId = benefitPlanId;
    }

    public decimal PersonalId { get; set; }

    public string? CurrentFirstName { get; set; }

    public string? CurrentLastName { get; set; }

    public string? CurrentMiddleName { get; set; }

    public DateOnly? BirthDate { get; set; }

    public string? SocialSecurityNumber { get; set; }

    public string? DriversLicense { get; set; }

    public string? CurrentAddress1 { get; set; }

    public string? CurrentAddress2 { get; set; }

    public string? CurrentCity { get; set; }

    public string? CurrentCountry { get; set; }

    public decimal? CurrentZip { get; set; }

    public string? CurrentGender { get; set; }

    public string? CurrentPhoneNumber { get; set; }

    public string? CurrentPersonalEmail { get; set; }

    public string? CurrentMaritalStatus { get; set; }

    public string? Ethnicity { get; set; }

    public short? ShareholderStatus { get; set; }

    public decimal? BenefitPlanId { get; set; }

    public virtual BenefitPlan? BenefitPlan { get; set; }

    public virtual ICollection<Employment> Employments { get; set; } = new List<Employment>();
}