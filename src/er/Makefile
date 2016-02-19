# This make file creates an entity-relationship diagram, using Andrew Gallant's 
# erd application (c.f. https://github.com/BurntSushi/erd).
#
# There is a bug in erd, that leaves font properties empty for
# fields and relationships. To remedy this, the make file transforms
# the intermediate DOT script.
#
DOC=../../doc
TMP1 := $(shell mktemp -u).dot
TMP2 := $(shell mktemp -u).dot

doc:
	erd -i family-tree.er -o $(TMP1)
	sed "s/<FONT>/<FONT FACE=\"Helvetica\" POINT-SIZE=\"12\">/g" $(TMP1) > $(TMP2)
	rm -f $(TMP1)
	dot -Tpng -o $(DOC)/entity-relationship-diagram.png $(TMP2)
	dot -Tpdf -o $(DOC)/entity-relationship-diagram.pdf $(TMP2)
	rm -f $(TMP2)
