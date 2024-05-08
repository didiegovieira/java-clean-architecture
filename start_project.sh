#!/bin/bash

# Função para verificar se o Docker está instalado
check_docker() {
    if ! command -v docker &> /dev/null; then
        echo "Docker não está instalado. Instalando Docker..."
        sudo apt-get update
        sudo apt-get install -y docker.io
    fi
}

# Função para verificar se o Docker Compose está instalado
check_docker_compose() {
    if ! command -v docker-compose &> /dev/null; then
        echo "Docker Compose não está instalado. Instalando Docker Compose..."
        sudo apt-get update
        sudo apt-get install -y docker-compose
    fi
}

# Função principal
main() {
    check_docker
    check_docker_compose

    # Iniciar o Docker Compose
    echo "Iniciando Docker Compose..."
    docker-compose up --build
}

main
