.PHONY: clean build run

clean:
	mvn clean

build:
	mvn verify

cleanBuild: clean build

run: build
	mvn -Pcargo.run -Drepo.path=./storage
