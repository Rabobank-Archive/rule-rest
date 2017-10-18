package controllers

import nl.rabobank.oss.rules.derivations.Derivation
import nl.rabobank.oss.rules.engine._

object RulesRunner {
  def run(context: Context, derivations: List[Derivation]): Context = FactEngine.runNormalDerivations(context, derivations)
  def runDebug(context: Context, derivations: List[Derivation]): (Context, List[Step]) = FactEngine.runDebugDerivations(context, derivations)
}
