﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Gestion_De_Stock
{
    internal interface Susceptible
    {
        void LancerLeSolde(int Pourcentage);

        void TerminerLeSolde(int Pourcentage);
    }
}
