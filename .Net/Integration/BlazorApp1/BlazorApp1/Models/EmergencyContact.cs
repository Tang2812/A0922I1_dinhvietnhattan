﻿using System;
using System.Collections.Generic;

namespace BlazorApp1.Models;

public partial class EmergencyContact
{
    public decimal EmployeeId { get; set; }

    public string? EmergencyContactName { get; set; }

    public string? PhoneNumber { get; set; }

    public string? Relationship { get; set; }

    public virtual Personal Employee { get; set; } = null!;
}