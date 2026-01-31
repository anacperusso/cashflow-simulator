# Arquitetura do Sistema

O Cashflow Simulator é dividido em componentes com responsabilidades claras.

## Componentes

- CashflowSimulator  
Responsável exclusivamente pela simulação determinística do fluxo de caixa diário.

- SimulationResult  
Modelo de dados que representa o resultado da simulação.

- RiskAnalyzer  
Camada de decisão que classifica o risco financeiro com base no resultado da simulação.

- RiskLevel  
Enumeração dos níveis de risco: SAFE, WARNING, CRITICAL.

## Fluxo de Execução

1. Entrada de parâmetros financeiros
2. Simulação diária de caixa
3. Detecção de quebra ou sobrevivência
4. Análise de risco desacoplada
5. Retorno de resultado consolidado

## Princípios

- Separação de responsabilidades
- Lógica determinística
- Código extensível
