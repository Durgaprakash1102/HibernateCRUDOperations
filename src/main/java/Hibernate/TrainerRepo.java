package Hibernate;

public interface TrainerRepo 
{
    void insertTrainer(Trainer t);
    void updateTrainer(Trainer t);
    void deleteTrainer(Trainer t);
    void selectTrainers();
}