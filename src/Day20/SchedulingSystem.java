package Day20;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

class Event{
    private final String name;
    private final LocalDateTime dateTime;
    private  final Duration duration;

    Event(String name, LocalDateTime dateTime, Duration duration) {
        this.name = name;
        this.dateTime = dateTime;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public Duration getDuration() {
        return duration;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public String toString(){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return"Event Name: "+name+" Date and Time: "+dateTime.format(formatter)+" Duration: "+duration.toHours()+" hours";
    }
}
public class SchedulingSystem {
    public static void main(String[] args) {
        List<Event> event= Arrays.asList(
                new Event("Meeting", LocalDateTime.of(2021, 10, 10, 10, 30), Duration.ofHours(1)),
                new Event("WorkShop", LocalDateTime.of(2021, 10, 10, 12, 30), Duration.ofHours(2)),
                new Event("Conference", LocalDateTime.of(2021, 11, 10, 14, 30), Duration.ofHours(2))
        );
        System.out.println("Display all the events");
        event.forEach(System.out::println);
        System.out.println("Filter the Events in specific date");
        event.stream()
                .filter(e->e.getDateTime().toLocalDate().equals(LocalDateTime.of(2021, 10, 10, 0, 0).toLocalDate()))
                .forEach(System.out::println);
        System.out.println("Calculate the duration between  events");
        for(int i=0;i< event.size()-1;i++){
            Event firstEvent=event.get(i);
            Event secondEvent=event.get(i+1);
            Duration duration=Duration.between(firstEvent.getDateTime(),secondEvent.getDateTime());
            System.out.println("Duration between "+firstEvent.getName()+" and "+secondEvent.getName()+" is "+duration.toHours()+" hours");
        }
    }
}