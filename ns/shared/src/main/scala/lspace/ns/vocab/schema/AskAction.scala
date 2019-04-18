package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{OntologyDef, Property}
object AskAction
    extends OntologyDef(
      iri = "http://schema.org/AskAction",
      iris = Set("http://schema.org/AskAction"),
      label = "AskAction",
      comment =
        """The act of posing a question / favor to someone.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/ReplyAction">ReplyAction</a>: Appears generally as a response to AskAction.</li>
</ul>
""",
      `@extends` = () => List(CommunicateAction.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.CommunicateAction.Properties {}
  override lazy val properties: List[Property] = List()
  trait Properties extends lspace.ns.vocab.schema.CommunicateAction.Properties {}
}