﻿using System;
using System.Collections.Generic;

namespace BlazorApp1.Models;

public partial class PayRate
{
    public int IdPayRates { get; set; }

    public string PayRateName { get; set; } = null!;

    public decimal Value { get; set; }

    public decimal TaxPercentage { get; set; }

    public int PayType { get; set; }

    public decimal PayAmount { get; set; }

    public decimal PtlevelC { get; set; }

    public virtual ICollection<Employee> Employees { get; set; } = new List<Employee>();
}
