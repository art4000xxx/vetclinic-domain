# Ветеринарная клиника (vetclinic-domain)

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-mvnd%201.0.2-green)](https://github.com/apache/maven-mvnd)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

## Описание проекта

Проект `vetclinic-domain` — это доменный слой системы ветеринарной клиники, разработанный по принципам **Domain-Driven Design (DDD)**. Он реализует бизнес-логику для управления клиентами, питомцами, приёмами и медицинскими записями. Проект является библиотекой (без точки входа `main`), но включает тестовый класс для проверки функциональности.

**Создатель**: art4000xxx

## Ubiquitous Language

Термины и требования описаны в файле [`UbiquitousLanguage.txt`](UbiquitousLanguage.txt):
- **Client**: Человек, владеющий питомцами и посещающий клинику.
- **Pet**: Животное, получающее ветеринарные услуги.
- **Appointment**: Запланированный или экстренный приём питомца у врача.
- **MedicalRecord**: Запись о визите питомца, включая симптомы, лекарства, операции и статус лечения.
- **Symptom**, **Medication**, **Operation**, **TreatmentStatus**, **Vet**, **AppointmentType**: Дополнительные сущности и объекты-значения.

**Требования**:
1. Клиенты могут записываться на приёмы (плановые или экстренные).
2. Врачи проводят приёмы, фиксируют симптомы, назначают лекарства/операции и обновляют статус лечения.
3. У каждого питомца есть история болезни.
4. Система проверяет доступность врача перед записью.
5. Клиенты могут иметь несколько питомцев.
6. Обеспечивается консистентность данных.

## Структура проекта
vetclinic-domain/
├── pom.xml                    # Конфигурация Maven
├── UbiquitousLanguage.txt     # Общий язык и требования
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/vetclinic/domain/
│   │   │       ├── model/     # Доменные объекты
│   │   │       │   ├── Appointment.java
│   │   │       │   ├── AppointmentType.java
│   │   │       │   ├── Client.java
│   │   │       │   ├── ContactInfo.java
│   │   │       │   ├── MedicalRecord.java
│   │   │       │   ├── Medication.java
│   │   │       │   ├── Operation.java
│   │   │       │   ├── Pet.java
│   │   │       │   ├── Symptom.java
│   │   │       │   ├── TreatmentStatus.java
│   │   │       │   ├── Vet.java
│   │   │       ├── service/   # Доменные сервисы
│   │   │           ├── AppointmentScheduler.java
│   │   │           ├── MedicalRecordService.java
│   ├── test/
│       ├── java/
│           ├── com/vetclinic/domain/
│               ├── TestVetClinic.java  # Тестовый класс
├── target/                    # Скомпилированные файлы (после сборки)
├── README.md                  # Этот файл

text

Копировать

## Технологии
- **Java**: 17 (Amazon Corretto)
- **Maven**: mvnd 1.0.2
- **Lombok**: 1.18.30 (для упрощения кода)
- **IDE**: IntelliJ IDEA (рекомендуется)

## Установка и настройка

### Требования
- **Java 17** (JDK, например, Amazon Corretto)
- **Maven Daemon (mvnd)** или классический Maven
- **IntelliJ IDEA** (опционально, для удобной работы)
