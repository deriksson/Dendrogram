# This make file creates an entity-relationship diagram, using Andrew Gallant's 
# erd application (c.f. https://github.com/BurntSushi/erd).
#
# There is a bug in erd, that leaves font properties empty for
# fields and relationships. To remedy this, the make file transforms
# the intermediate DOT script.
#
MKDIR = mkdir -p
DOC=../../doc
OUT=out
ERD_DOT=$(OUT)/family-tree.erd.dot
DOT=$(OUT)/family-tree.dot
PNG=$(OUT)/entity-relationship-diagram.png
PDF=$(OUT)/entity-relationship-diagram.pdf

doc: $(OUT)
	erd -i family-tree.er -o $(ERD_DOT)
	sed "s/<FONT>/<FONT FACE=\"Helvetica\" POINT-SIZE=\"12\">/g" $(ERD_DOT) > $(DOT)
	dot -Tpng -o $(PNG) $(DOT)
	dot -Tpdf -o $(PDF) $(DOT)

$(OUT):
	${MKDIR} $(OUT)

install: doc
	cp $(PNG) $(PDF) $(DOC)

clean:
	test -n "$(OUT)" && rm -rf $(OUT)
	rm -f *~
