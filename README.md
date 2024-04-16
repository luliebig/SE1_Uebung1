## SE1 Übung 1
bearbeitet von Luisa Liebig

**Frage 1:** Wie können sie unter Berücksichtigung der Prinzipien des objektorientierten Entwurfs dafür sorgen, dass der Code, der den beiden Implementierungen gemeinsam ist, nicht dupliziert wird?

Man kann das Prinzip der Vererbung nutzen und gemeinsamen Code in eine abstrakte Klasse auslagern, die von den beiden Implementierungen erweitert wird.

**Frage 2:** Wie kann die Objekterzeugung mit Hilfe einer zusätzlichen Klasse durchgeführt werden? In welchem Package sollte diese zusätzliche Klasse liegen?

In einer zusätzlichen Klasse kann eine static Methode dazu genutzt werden, ein Objekt der gewünschten Art zurückzugeben. Die Klasse sollte im businesslogic Package liegen, um Code und Anwendungsebene abzukapseln.

**Frage 3:** Welches Entwurfsmuster liegt für diesen Anwendungsfall nahe? Welchen Vorteil bringt die Nutzung dieses Entwurfsmusters?

Dieses Entwurfsmuster wird als Factory Design Pattern bezeichnet. Es kapselt die Erzeugung von Objekten und ermöglicht eine gute Erweiterbarkeit, wenn weitere Transformertypen hinzugefügt werden.

**Frage 4:** Warum sollten Testfälle in einer separaten Test-Klasse implementiert werden?

Eine separate Test-Klasse sorgt für Organisation und hilft Übersichtlichkeit zu behalten. Eine klare Struktur unterstützt die Erweiterbarkeit des Codes.

**Frage 5:** Wozu dienen die Äquivalenzklassen im Blackbox-Test?

Äquivalenzklassen dienen dazu systematisch eine sinnvolle Auswahl an Testfällen zu erzeugen, da ein vollständiger Test mit allen möglichen Parameter Kombinationen nicht realistisch ist.

**Frage 6:** Warum lässt sich für die Klasse Client nicht ohne weiteres ein Blackbox-Test umsetzen?

Die Klasse Client bzw die Methode printTransformation hat kein return value, das einfach in einem Blackbox-Test überprüft werden kann. Man müsste die print-Ausgabe abfangen und überprüfen.
