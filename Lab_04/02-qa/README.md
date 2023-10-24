# Quality Assurance

## Fase 1

* Analizzare la classe `cat`.
* Verificare se la classe è valida, ad esempio eseguendo la build con gradle e verificando che un file `.class` viene effetivamente generato.
    * La classe può essere effettivamente utilizzata senza problemi...
* Tuttavia l’utilizzo delle corrette convenzioni è stato messo completamente da parte. Di conseguenza il codice è difficile da leggere e da capire.
---
* Prendendo in considerazione un solo file, questo aspetto potrebbe non sembrare troppo problematico.
* Tuttavia, in sistemi software composti da decine se non centinaia di classi, è impossibile riuscire a programmare agilmente senza qualche regola.
---
## Fase 2

* Riscrivere la classe `cat` utilizzando le corrette convenzioni illustrate a lezione.
    * Attenzione! Le funzionalità della classe non devono cambiare.
    Non è necessario scrivere più metodi di quanti ce ne siano già nella classe originale.
    I principi di incapsulamento, in ogni caso, valgono sempre.
    È possibile quindi fare cambiamenti sensati se si notano imperfezioni nel codice.
* Solo una volta sistemata la classe, aggiungere [Checkstyle](https://unibo-lptsi-pss.github.io/08a-codestyle/#/15) al progetto, e verificare se sono state rispettate tutte le convenzioni.
    * In caso negativo capire l'errore e riprovare fino a raggiungere il successo. 
